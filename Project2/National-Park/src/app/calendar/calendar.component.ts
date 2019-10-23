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
  
  @Input() dates: Array<Date> = []

  constructor() { }

  ngOnInit() { }
  
  /*addEvent(event) {
    this.dates.subscribe(event.startDate);*/
  
}
