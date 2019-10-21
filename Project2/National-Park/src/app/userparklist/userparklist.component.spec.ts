import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserparklistComponent } from './userparklist.component';

describe('UserparklistComponent', () => {
  let component: UserparklistComponent;
  let fixture: ComponentFixture<UserparklistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserparklistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserparklistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
