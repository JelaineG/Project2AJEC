import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-userparklist',
  templateUrl: './userparklist.component.html',
  styleUrls: ['./userparklist.component.css']
})
export class UserparklistComponent implements OnInit {
  isLoggedIn=true;

  ngOnInit() {
  }

    // STEP 5
    readonly ROOT_URL = 'https://api.myjson.com/bins/1bwb3g'

    // STEP 6
    posts: any;
  
    // STEP 4
    constructor(private http: HttpClient) { }
  
    // STEP 7
    getPosts() {
      this.posts = this.http.get(this.ROOT_URL)
    }

}
