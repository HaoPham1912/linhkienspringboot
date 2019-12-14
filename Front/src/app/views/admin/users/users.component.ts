import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from '../../../containers/services/users/users'
import { UsersService } from '../../../containers/services/users/users.service';


import { Router, ActivatedRoute } from '@angular/router';
import { Order } from '../../../containers/services/orders/order';
import { OrdersService } from '../../../containers/services/orders/orders.service';

@Component({
  templateUrl: 'users.component.html'
})
export class UsersComponent implements OnInit {
  users: Users[] = [];
  id: number;
  order: Order;
  constructor(
    private userService: UsersService,
    private route: ActivatedRoute, private router: Router,
    private orderService: OrdersService
  ) {

  }
  ngOnInit() {
    this.getAllUsers();  
      this.order = new Order();
      this.id = this.route.snapshot.params['id'];
     
      this.orderService.getOrder(this.id)
        .subscribe(data => {
          console.log(data)
          this.order = data;
        }, error => console.log(error));
  }
  list(){
    this.router.navigate(['/admin']);
  }

  public getAllUsers() {

    this.userService.getAllUsers().subscribe(
      res => {
        this.users = res;
      },
      err => {
        alert("An error has occur")
      }
    );
  }
 

}
