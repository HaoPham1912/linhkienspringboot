import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class OrdersService {
  private BASE_URL = "http://localhost:8080/api/getOrder";

  constructor(private http: HttpClient) { }
  getOrder(id: number): Observable<any> {
    return this.http.get(`${this.BASE_URL}/${id}`);
  }

}
