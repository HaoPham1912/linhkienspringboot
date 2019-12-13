import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Products } from './products';
@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private BASE_URL = "http://localhost:8080/api";
  private ALL_PRODUCTS_URL =`${this.BASE_URL}\\getListProduct`;
  private CREATE_PRODUCTS_URL =`${this.BASE_URL}\\addProduct`;
  private category_url= `${this.BASE_URL}\\listAllCategory`;
  constructor(private http: HttpClient) {

   }
   getAllProducts() : Observable <Products[]>{
    return this.http.get<Products[]>(this.ALL_PRODUCTS_URL);
   }
   getAllInPage(page: number, size: number): Observable<any> {
    const url = `${this.ALL_PRODUCTS_URL}?page=${page}&size=${size}`;
    return this.http.get(url)
        .pipe(
            // tap(_ => console.log(_)),
        )
}
getCategoryInPage(categoryType: number, page: number, size: number): Observable<any> {
  const url = `${this.category_url}/${categoryType}?page=${page}&size=${size}`;
  return this.http.get(url).pipe(
      // tap(data => console.log(data))
  );
}
createProduct(product: Object): Observable<Object> {
  return this.http.post(`${this.CREATE_PRODUCTS_URL}`, product);
}

}
