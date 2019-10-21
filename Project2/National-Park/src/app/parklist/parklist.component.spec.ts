import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParklistComponent } from './parklist.component';

describe('ParklistComponent', () => {
  let component: ParklistComponent;
  let fixture: ComponentFixture<ParklistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParklistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParklistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
