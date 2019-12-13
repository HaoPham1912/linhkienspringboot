import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FileRestrictions, SelectEvent, RemoveEvent } from '@progress/kendo-angular-upload';
import { Products } from '../../../containers/services/products/products'
import { ProductsService } from '../../../containers/services/products/products.service';
import { Router, ActivatedRoute } from '@angular/router';
@Component({
  templateUrl: 'products.component.html'
})
export class ProductsComponent {
  products: Products[]=[];
  constructor(private productService: ProductsService) { }
  ngOnInit(){
    this.getAllProducts();
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
