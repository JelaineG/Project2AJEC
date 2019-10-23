import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-parklist',
  templateUrl: './parklist.component.html',
  styleUrls: ['./parklist.component.css'],
  providers: [ApiService]
})
export class ParklistComponent implements OnInit {
  private API_KEY = '3vvdfEW8e5IXlZ5GPH6ewkGA4TC8ioJABEwnbrEF';

  constructor(private apiService: ApiService) { }

  ngOnInit() {}
  
}
