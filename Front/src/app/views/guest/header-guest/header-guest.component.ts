import { Component, OnInit, OnDestroy } from '@angular/core';
import { CategoriesService } from '../../../containers/services/categories/categories.service';
import { Category } from '../../homepage/category';

@Component({
  selector: 'app-header-guest',
  templateUrl: './header-guest.component.html',
  styleUrls: ['./header-guest.component.css','../../user/share/user-style.css']
})
export class HeaderGuestComponent implements OnDestroy, OnInit {

  status: { isOpen: boolean } = { isOpen: false };
  disabled: boolean = false;
  isDropup: boolean = true;
  autoClose: boolean = false;
  categories: Category[]=[];
  items: string[] = [
    'The first choice!',
    'And another choice for you.',
    'but wait! A third!'
  ];

  constructor(private categoriesService: CategoriesService) { }
  ngOnInit(){
    this.getAllCategories();
  }
  getAllCategories(){
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
