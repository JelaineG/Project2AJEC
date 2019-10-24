import { Component, 
  OnInit, 
  Output, 
  Input,
  ViewChild
} from '@angular/core';

/*import dayGridPlugin from '@fullcalendar/daygrid';*/


@Component({
  selector: 'app-calendar',
  templateUrl: './calendar.component.html',
  styleUrls: ['./calendar.component.css']
})

export class CalendarComponent implements OnInit {
  /*calendarPlugin = [dayGridPlugin];*/
  
  @Input() dates: Array<Date>;
  

  constructor() { }

  ngOnInit() { }
  
  // ngOnChanges(changes: SimpleChanges) { PUT BACK
  //   console.log(changes);
  //   if(changes.dates) {
  //       console.log(changes.dates.currentValue[0])
  //       const date = new Date(Date.parse(changes.dates.currentValue[0]));
  //       console.log(date);
  //   }
  // }
  
  /*addEvent(event) {
    this.dates.subscribe(event.startDate);*/
  
}
