import { Component, OnInit } from '@angular/core';
import { Http, Headers, Response, RequestOptions, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {

  constructor(private http: Http) { 
    this.getAccountDetails();
  }

  ngOnInit() {
  }

  getAccountDetails() {
    let headers = new Headers({ 'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json' });
    let myParams = new URLSearchParams();
    myParams.set('username', (JSON.parse(localStorage.getItem('currentUser'))).username);	
    let options = new RequestOptions({ headers: headers, params: myParams });
    this.http.get('http://localhost:8087/v1/accounts/summary', options)
      .subscribe((response: Response) => {
        console.log(response.json());
    });
  }
}
