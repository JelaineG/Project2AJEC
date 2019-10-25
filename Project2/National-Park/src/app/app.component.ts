import { Component } from '@angular/core';
// import { HttpClient } from '@angular/common/http'; STEP 3

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isLoggedIn = false;
  title = 'National-Park';
  
  // readonly ROOT_URL = 'https://api.myjson.com/bins/1bwb3g' STEP 5

  // posts: any; STEP 6

  // constructor(private http: HttpClient) { } STEP 4
  constructor() { } 

  // getPosts() { STEP 7
  //   this.posts = this.http.get(this.ROOT_URL)
  // }

}

