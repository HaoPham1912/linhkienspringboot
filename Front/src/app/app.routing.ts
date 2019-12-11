import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
// Import Containers
import { AdminLayoutComponent } from './containers/admin-layout';
import { UserLayoutComponent } from './containers/user-layout/user-layout.component';
import { P404Component } from './views/error/404.component';
import { P500Component } from './views/error/500.component';
import { LoginComponent } from './views/login/login.component';
import { RegisterComponent } from './views/register/register.component';
import { ManageModule } from './views/admin/manage.module';
import { HomepageComponent } from './views/homepage/homepage.component';
import { ProductDetailComponent } from './views/user/share/product-detail/product-detail.component';
import { ProductListComponent } from './views/user/share/product-list/product-list.component';
import { CartComponent } from './views/user/share/cart/cart.component';
import { CheckoutComponent} from './views/user/share/checkout/checkout.component';
import { ManageComponent } from './views/user/manage/manage.component';
import { InformationComponent } from './views/user/manage/information/information.component';
import {OrdersComponent} from './views/user/manage/orders/orders.component';
import { GuestLayoutComponent } from './containers/guest-layout/guest-layout.component';
export const routes: Routes = [
  {
    path: '',
    redirectTo: 'admin',
    pathMatch: 'full',
  },
  {
    path: '404',
    component: P404Component,
    data: {
      title: 'Page 404'
    }
  },
  {
    path: '500',
    component: P500Component,
    data: {
      title: 'Page 500'
    }
  },
  {
    path: 'login',
    component: LoginComponent,
    data: {
      title: 'Login Page'
    }
  },
  {
    path: 'register',
    component: RegisterComponent,
    data: {
      title: 'Register Page'
    }
  },
  {
    path: 'user/manage',
    component: ManageComponent,
      children: [
        {
          //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
          path: '',
          component: InformationComponent,
        },
        {
          path: 'information',
          component: InformationComponent,
        },
        {
          path: 'checkorders',
          component: OrdersComponent,
        },
        
      ]
  },
  {
    path: 'user',
    component: UserLayoutComponent,
    data: {
      title: 'User'
    },
    children: [
      {
        //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
        path: '',
        component: HomepageComponent,
      },
      {
        path: 'homepage',
        component: HomepageComponent,
      },
      {
        path: 'laptop',
        component: ProductListComponent,
      },
      {
        path: 'viewproductlist',
        component: ProductListComponent,
      },
      {
        path: 'viewproductdetail',
        component: ProductDetailComponent,
      },
      {
        path: 'viewcart',
        component: CartComponent,
      },
      {
        path: 'checkout',
        component: CheckoutComponent,
      },
    
        // {
        //   //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
        //   path: '',
        //   loadChildren: () => import('./views/admin/manage.module').then(m => m.ManageModule)
        // },
    ]
  },
  {
    path: 'guest',
    component: GuestLayoutComponent,
    data: {
      title: 'Guest'
    },
    children: [
      {
        path: '',
        component: HomepageComponent,
      },
      {
        path: 'homepage',
        component: HomepageComponent,
      },
      {
        path: 'laptop',
        component: ProductListComponent,
      },
      {
        path: 'viewproductlist',
        component: ProductListComponent,
      },
      {
        path: 'viewproductdetail',
        component: ProductDetailComponent,
      },
      {
        path: 'viewcart',
        component: CartComponent,
      },
      {
        path: 'checkout',
        component: CheckoutComponent,
      },
    
    ]
  },
  {
    path: 'admin',
    component: AdminLayoutComponent,
    data: {
      title: 'Admin'
    },
    children: [
      {
        //tạm thời chưa biết hiển thị gì nên hiện đỡ tab user đầu
        path: '',
        loadChildren: () => import('./views/admin/manage.module').then(m => m.ManageModule)
      },
            {
        path: 'manage',
        loadChildren: () => import('./views/admin/manage.module').then(m => m.ManageModule)
      },
    ]
  },
  { path: '**', component: P404Component }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
