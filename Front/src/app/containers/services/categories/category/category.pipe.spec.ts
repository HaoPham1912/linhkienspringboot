import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoryPipe } from './category.pipe';

describe('CategoryPipe', () => {
  let component: CategoryPipe;
  let fixture: ComponentFixture<CategoryPipe>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CategoryPipe ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CategoryPipe);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
