import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-user-wishlist',
  templateUrl: './user-wishlist.component.html',
  styleUrls: ['./user-wishlist.component.css'],
})
export class UserWishlistComponent implements OnInit{
  /*emits a custom event to the parent component: home, custom event is startDateSelected*/
  @Output() startDateSelected: EventEmitter<any> = new EventEmitter<any>();
  
  
  /*startDate = '';
  endDate = '';*/

  constructor() { }

  ngOnInit() {
  }
  
  startDateSubmission(event: Event){
    /*console.log(event.target.value);
    *prints value of date that user selects *as a string
    */
    
    /*console.log(this.startDateSelected);
    *prints information about the EventEmitter, startDateSelected
    */
    // this.startDateSelected.emit({newStartDate: event.target.value}); PUT BACK
  }
  
  /*endDateSubmission(event: Event){
    console.log(event.target.value);
  }*/

}
