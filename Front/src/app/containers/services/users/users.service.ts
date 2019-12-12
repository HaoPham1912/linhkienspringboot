import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
  private BASE_URL = "http://localhost:8080";
  private ALL_USERS_URL =`${this.BASE_URL}\\getAllUser`;
  private CREATE_USERS_URL = `${this.BASE_URL}\\addUser`;
  constructor(private http: HttpClient) { }
  getAllUsers() : Observable <Users[]>{
    return this.http.get<Users[]>(this.ALL_USERS_URL);
   }
   postUser (user: Users): Observable <Users>{
     return this.http.post<Users>(this.CREATE_USERS_URL,user); 
   }
}
