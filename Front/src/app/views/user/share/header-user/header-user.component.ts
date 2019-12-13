import { Component,OnDestroy, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Category} from '../../../homepage/category';
import { CategoriesService } from '../../../../containers/services/categories/categories.service';
@Component({
  selector: 'app-header-user',
  templateUrl: './header-user.component.html',
  styleUrls: ['./header-user.component.css','../../share/user-style.css']
})
export class HeaderUserComponent implements  OnDestroy {
  categories: Category[]=[];
  status: { isOpen: boolean } = { isOpen: false };
  disabled: boolean = false;
  isDropup: boolean = true;
  autoClose: boolean = false;

  items: string[] = [
    'The first choice!',
    'And another choice for you.',
    'but wait! A third!'
  ];

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

  ngOnDestroy () {
    this.status.isOpen = false;
  }

  onHidden(): void {
    console.log('Dropdown is hidden');
  }
  onShown(): void {
    console.log('Dropdown is shown');
  }
  isOpenChange(): void {
    console.log('Dropdown state is changed');
  }

  toggleDropdown($event: MouseEvent): void {
    $event.preventDefault();
    $event.stopPropagation();
    this.status.isOpen = !this.status.isOpen;
  }

  change(value: boolean): void {
    this.status.isOpen = value;
  }
}
