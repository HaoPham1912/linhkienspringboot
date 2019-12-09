import { Component, OnInit } from '@angular/core';
import { UsersService } from '../../../containers/services/users.service';
import {User} from "../../../containers/services/users";

import { Router, ActivatedRoute } from '@angular/router';
@Component({
  templateUrl: 'users.component.html'
})
export class UsersComponent implements OnInit{
  fullName: string;
  user: User;

  constructor( 
    private userService: UsersService,private route: ActivatedRoute
    ) {

    }
  ngOnInit(){
    this.user= new User();

      this.fullName = this.route.snapshot.params['id'];

    this.userService.getUserList(this.fullName)
      .subscribe(data => {
        console.log(data)
        this.user = data;
      }, error => console.log(error));
  }
}
