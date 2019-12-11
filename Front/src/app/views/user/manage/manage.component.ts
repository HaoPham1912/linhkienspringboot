import { Component } from '@angular/core';
import { navUserItems } from '../../../_nav';

@Component({
  selector: 'app-manage',
  templateUrl: './manage.component.html',
  styleUrls: ['./manage.component.css']
})
export class ManageComponent  {
  public sidebarMinimized = false;
  public navUserItems = navUserItems;
  toggleMinimize(e) {
    this.sidebarMinimized = e;
  }
 
}
