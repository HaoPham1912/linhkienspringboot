// Angular
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
// Forms Component
import { ProductsComponent } from './products/products.component';
import { UsersComponent } from './users/users.component';
// Tabs Component
import { TabsModule } from 'ngx-bootstrap/tabs';
import { CategoriesComponent } from './categories/categories.component';
// Carousel Component
import { CarouselModule } from 'ngx-bootstrap/carousel';
// Collapse Component
import { CollapseModule } from 'ngx-bootstrap/collapse';
// Dropdowns Component
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
// Pagination Component
import { PaginationModule } from 'ngx-bootstrap/pagination';
// Popover Component
import { PopoverModule } from 'ngx-bootstrap/popover';
// Progress Component
import { ProgressbarModule } from 'ngx-bootstrap/progressbar';
// Tooltip Component
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { OrdersComponent } from './orders/orders.component';
// Modal Component
import { ModalModule } from 'ngx-bootstrap/modal';
// Components Routing
import { ManageRoutingModule } from './manage-routing.module';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ManageRoutingModule,
    BsDropdownModule.forRoot(),
    TabsModule,
    CarouselModule.forRoot(),
    CollapseModule.forRoot(),
    PaginationModule.forRoot(),
    PopoverModule.forRoot(),
    ProgressbarModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot()
  ],
  declarations: [
    ProductsComponent,
    UsersComponent,
    CategoriesComponent,
    OrdersComponent
  ]
})
export class ManageModule { }
