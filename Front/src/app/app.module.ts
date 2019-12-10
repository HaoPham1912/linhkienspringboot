import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { LocationStrategy, PathLocationStrategy  } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PerfectScrollbarModule } from 'ngx-perfect-scrollbar';
import { PERFECT_SCROLLBAR_CONFIG } from 'ngx-perfect-scrollbar';
import { PerfectScrollbarConfigInterface } from 'ngx-perfect-scrollbar';
import { ModalModule } from 'ngx-bootstrap/modal';
import {NumberPickerModule} from 'ng-number-picker';

const DEFAULT_PERFECT_SCROLLBAR_CONFIG: PerfectScrollbarConfigInterface = {
  suppressScrollX: true
};
import { AppComponent } from './app.component';
// Import containers
import { AdminLayoutComponent } from './containers/admin-layout';
import { UserLayoutComponent } from './containers/user-layout/user-layout.component';
import { P404Component } from './views/error/404.component';
import { P500Component } from './views/error/500.component';
import { LoginComponent } from './views/login/login.component';
import { RegisterComponent } from './views/register/register.component';
// homepage import start
import { HomepageComponent } from './views/homepage/homepage.component';
// homepage import end
// user import start
import { HeaderUserComponent } from './views/user/share/header-user/header-user.component';
import { FooterUserComponent } from './views/user/share/footer-user/footer-user.component';
import { ProductDetailComponent } from './views/user/share/product-detail/product-detail.component';
import { ProductListComponent } from './views/user/share/product-list/product-list.component';
// user import end
const APP_CONTAINERS = [
  AdminLayoutComponent
];
import {
  AppAsideModule,
  AppBreadcrumbModule,
  AppHeaderModule,
  AppFooterModule,
  AppSidebarModule,
  
} from '@coreui/angular';
// Import routing module
import { AppRoutingModule } from './app.routing';

// Import 3rd party components
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TabsModule } from 'ngx-bootstrap/tabs';
import { ChartsModule } from 'ng2-charts';
import { UploadModule } from '@progress/kendo-angular-upload';
import { HttpClientModule } from '@angular/common/http';
import { CartComponent } from './views/user/share/cart/cart.component';
import { CheckoutComponent } from './views/user/share/checkout/checkout.component';
import { OrderComponent } from './views/user/share/order/order.component';




@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    AppAsideModule,
    AppBreadcrumbModule.forRoot(),
    AppFooterModule,
    AppHeaderModule,
    AppSidebarModule,
    PerfectScrollbarModule,
    BsDropdownModule.forRoot(),
    TabsModule.forRoot(),
    ChartsModule,
    ModalModule.forRoot(),
    UploadModule,
    HttpClientModule,
    NumberPickerModule
  ],
  declarations: [
    AppComponent,
    ...APP_CONTAINERS,
    P404Component,
    P500Component,
    LoginComponent,
    RegisterComponent,
    UserLayoutComponent,
    AdminLayoutComponent,
    FooterUserComponent,
    HeaderUserComponent,
    HomepageComponent,
    ProductDetailComponent,
    ProductListComponent,
    CartComponent,
    CheckoutComponent,
    OrderComponent
  ],
  providers: [{
    provide: LocationStrategy,
    useClass: PathLocationStrategy 
  }],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
