import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../../../views/homepage/category';

@Injectable({
  providedIn: 'root'
})
export class CategoriesService {
  private BASE_URL = "http://localhost:8080";
  private ALL_CATEGORIES_URL =`${this.BASE_URL}\\listAllCategory`;

  constructor(private http: HttpClient) {

   }
   getAllCategories() : Observable <Category[]>{
    return this.http.get<Category[]>(this.ALL_CATEGORIES_URL);
   }

   
}
