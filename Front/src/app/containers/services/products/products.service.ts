import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Products } from './products';
@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private BASE_URL = "http://localhost:8080";
  private ALL_PRODUCTS_URL =`${this.BASE_URL}\\getList`;
  constructor(private http: HttpClient) {

   }
   getAllProducts() : Observable <Products[]>{
    return this.http.get<Products[]>(this.ALL_PRODUCTS_URL);
   }
}
