import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Category} from './category';
import { CategoriesService } from '../../containers/services/categories/categories.service';
@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css','..//user/share/user-style.css']
})
export class HomepageComponent implements OnInit {
  categories: Category[]=[];
  constructor(private categoriesService: CategoriesService) { }

  ngOnInit() {
    this.getAllCategories();
  }
public getAllCategories(){

  this.categoriesService.getAllCategories().subscribe(
    res => {
      this.categories = res;
    },
    err => {
      alert ("An error hass occur")
    }
  );
}

}
