import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-parklist',
  templateUrl: './parklist.component.html',
  styleUrls: ['./parklist.component.css'],
  providers: [ApiService]
})
export class ParklistComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() { }
  
  // STEP 5
  readonly ROOT_URL = 'https://api.myjson.com/bins/q2rrw'

  // STEP 6
  posts: any;

  // STEP 7
  getPosts() {
    this.posts = this.http.get(this.ROOT_URL)
  }
}
