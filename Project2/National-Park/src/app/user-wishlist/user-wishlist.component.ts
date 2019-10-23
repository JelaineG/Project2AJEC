import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-user-wishlist',
  templateUrl: './user-wishlist.component.html',
  styleUrls: ['./user-wishlist.component.css'],
})
export class UserWishlistComponent implements OnInit{
  @Output() startDateSelected: EventEmitter<any> = new EventEmitter<any>();
  
  
  startDate = '';
  endDate = '';

  constructor() { }

  ngOnInit() {
  }
  
  startDateSubmission(event: Event){
    console.log(event.target.value);
    console.log(this.startDateSelected);
    this.startDateSelected.emit({newStartDate: event});
  }
  
  endDateSubmission(event: Event){
    console.log(event.target);
  }

}
