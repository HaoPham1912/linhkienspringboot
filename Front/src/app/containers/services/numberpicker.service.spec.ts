import { TestBed } from '@angular/core/testing';

import { NumberpickerService } from './numberpicker.service';

describe('NumberpickerService', () => {
  let service: NumberpickerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumberpickerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
