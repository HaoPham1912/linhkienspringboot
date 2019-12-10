import { Injectable } from '@angular/core';
import {NumberPickerModule, NumberPickerService} from '@coreui/coreui';
@Injectable({
  providedIn: 'root'
})
export class NumberpickerService {

  min = 10;
  max = 50;
  step = 5;
  precision = 1;
  pickStartAfter = 100;
  pickTimer = 100;
  value = 15;
}
