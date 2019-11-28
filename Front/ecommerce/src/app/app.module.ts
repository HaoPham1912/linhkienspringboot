import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderGuestComponent } from './shared/header-guest/header-guest.component';
import { HeaderCusComponent } from './shared/header-cus/header-cus.component';
import { HomepageComponent } from './layout/homepage/homepage.component';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { MatTabsModule } from '@angular/material';
import { MatToolbarModule, MatIconModule, MatSidenavModule, MatListModule, MatButtonModule } from  '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { SlickCarouselModule } from 'ngx-slick-carousel';
import { CartComponent } from './components/cart/cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { HttpClientModule }    from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { OrdersComponent } from './components/orders/orders.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductDetailComponent,
    FooterComponent,
    HeaderGuestComponent,
    HeaderCusComponent,
    HomepageComponent,
    CartComponent,
    CheckoutComponent,
    LoginComponent,
    RegisterComponent,
    OrdersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    AngularFontAwesomeModule,
    BrowserAnimationsModule,
    MatTabsModule,
    MatSidenavModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatButtonModule,
    SlickCarouselModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
