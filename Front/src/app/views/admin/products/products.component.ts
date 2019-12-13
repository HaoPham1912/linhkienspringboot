import { Component, OnInit } from '@angular/core';
// import { HttpClient } from '@angular/common/http';
// import { FileRestrictions, SelectEvent, RemoveEvent } from '@progress/kendo-angular-upload';
import { Products } from '../../../containers/services/products/products'
import { ProductsService } from '../../../containers/services/products/products.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  templateUrl: 'products.component.html'
})
export class ProductsComponent implements OnInit{
  products: Products[]=[];
  product: Products = new Products();
  submitted = false; 
  constructor(private productService: ProductsService,
    private router: Router,
    private route:ActivatedRoute
    ) { }
  ngOnInit(){
    this.getAllProducts();
  }
  newProduct(): void {
    this.submitted = false;
    this.product = new Products();
  }
  save() {
    this.productService.createProduct(this.product)
      .subscribe(data => console.log(data), error => console.log(error));
    this.product = new Products();
    this.gotoList();
  }
 onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    // this.router.navigate(['/admin/manage/products']);
    // this.router.navigate(['admin/manage/products'],{relativeTo:this.route})
    
  }
  public getAllProducts(){

    this.productService.getAllProducts().subscribe(
      res => {
        this.products = res;
      },
      err => {
        alert ("An error has occur")
      }
    );
  }
}
