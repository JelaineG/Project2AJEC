import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit { 
  isLoggedIn=true;
  dateData: Array<Date>

  constructor() { }

  ngOnInit() {
  
  }
  
  newStartDateSelected(event) {
        console.log(dateData);
        this.dateData.push(event.newStartDate);
    }
  
}
