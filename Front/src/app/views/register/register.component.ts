import { Component, OnInit } from '@angular/core';
import { Users } from '../../containers/services/users/users';
import { UsersService } from '../../containers/services/users/users.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
 
  templateUrl: 'register.component.html',
  styleUrls: ['..//user/share/user-style.css']
})
export class RegisterComponent implements OnInit{
 
  user: Users = new Users();
  submitted = false; 
  constructor(private userService: UsersService,
    private router: Router,
    private route:ActivatedRoute) { }
  ngOnInit(){}
  newProduct(): void {
    this.submitted = false;
    this.user = new Users();
  }
  save() {
    this.userService.registerUser(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new Users();
    this.reloadPage();
  }
 onSubmit() {
    this.submitted = true;
    this.save();
  }
  reloadPage(){
    // alert("")
    //   this.router.navigate(['/guest/login']);
  }
}
