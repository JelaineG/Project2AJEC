import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-wishlist',
  templateUrl: './user-wishlist.component.html',
  styleUrls: ['./user-wishlist.component.css'],
})
export class UserWishlistComponent implements OnInit{


  constructor() { }

  ngOnInit() {
  }
  
  startDateSubmission(){
    console.log(this.startDate);
  }
  
  endDateSubmission(){
    console.log(this.endDate);
  }

}
