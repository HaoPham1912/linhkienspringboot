import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { UsersComponent } from './users/users.component';
import { CategoriesComponent } from './categories/categories.component';
import {OrdersComponent} from './orders/orders.component';
const routes: Routes = [
  {
    
    path: '',
    data: {
      title: 'Manage'
    },
    children: [
      {
        //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
        path: '',
        component: UsersComponent,
        data: {
          title: 'Users'
        }
      },
      {
        //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
        path: 'manage',
        component: UsersComponent,
        data: {
          title: 'Users'
        }
      },
      {
        path: 'users',
        component: UsersComponent,
        data: {
          title: 'Users'
        }
      },
      {
        path: 'products',
        component: ProductsComponent,
        data: {
          title: 'Products'
        }
      },
      {
        path: 'categories',
        component: CategoriesComponent,
        data: {
          title: 'Categories'
        }
      },
      {
        path: 'orders',
        component: OrdersComponent,
        data: {
          title: 'Orders'
        }
      }
    ]
  }
];
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ManageRoutingModule {}
