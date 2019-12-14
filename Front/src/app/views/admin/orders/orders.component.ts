import {Component, OnInit} from '@angular/core';
import { Order } from '../../../containers/services/orders/order';
import { ActivatedRoute, Router } from '@angular/router';
import { OrdersService } from '../../../containers/services/orders/orders.service';


@Component({
  templateUrl: 'orders.component.html'
})
export class OrdersComponent implements OnInit {
  id: number;
  order: Order;
  constructor(private route: ActivatedRoute,private router: Router,
    private orderService: OrdersService) {
 
  }
  ngOnInit(){
  }
 

}
