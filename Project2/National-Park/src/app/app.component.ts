import { Component } from '@angular/core';
// STEP 3
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isLoggedIn = false;
  title = 'National-Park';
  
  // // STEP 5
  // readonly ROOT_URL = 'https://api.myjson.com/bins/1bwb3g'

  // // STEP 6
  // posts: any;

  // // STEP 4
  // constructor(private http: HttpClient) { }

  // // STEP 7
  // getPosts() {
  //   this.posts = this.http.get(this.ROOT_URL)
  // }

}

