import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UsersService {
 
  private baseUrl = 'http://localhost:8080/getAllUser';
  constructor(private http: HttpClient) { }
  getUserList(fullName: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${fullName}`);
  }
}
