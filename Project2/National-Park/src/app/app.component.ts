import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isLoggedIn = false;
  title = 'National-Park';
  
  readonly ROOT_URL = 'https://api.myjson.com/bins/1bwb3g'

  posts: any;

  constructor(private http: HttpClient) { }

  getPosts() {
    this.posts = this.http.get(this.ROOT_URL)
  }

}

