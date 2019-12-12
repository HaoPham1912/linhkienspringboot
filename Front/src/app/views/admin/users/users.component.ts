import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from '../../../containers/services/users/users'
import { UsersService } from '../../../containers/services/users/users.service';


import { Router, ActivatedRoute } from '@angular/router';
@Component({
  templateUrl: 'users.component.html'
})
export class UsersComponent implements OnInit{
  users: Users[]=[];

  constructor( 
    private userService: UsersService
    ) {

    }
  ngOnInit(){
    this.getAllUsers();
  }
  public getAllUsers(){

    this.userService.getAllUsers().subscribe(
      res => {
        this.users = res;
      },
      err => {
        alert ("An error has occur")
      }
    );
  }
  createUser(){
   
   
  }
}
