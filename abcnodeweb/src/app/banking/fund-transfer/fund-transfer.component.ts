import { Component, OnInit } from '@angular/core';
import { Http, Headers, Response, RequestOptions, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-fund-transfer',
  templateUrl: './fund-transfer.component.html',
  styleUrls: ['./fund-transfer.component.scss']
})
export class FundTransferComponent implements OnInit {
  model: any = {};
  accountSummary: any = {};

  constructor(private http: Http) {
    this.getAccountDetails();
  }

  ngOnInit() {
  }

  public transfer() {

  }

  getAccountDetails() {
    let headers = new Headers({ 'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json' });
    let myParams = new URLSearchParams();
    myParams.set('username', (JSON.parse(localStorage.getItem('currentUser'))).username);
    let options = new RequestOptions({ headers: headers, params: myParams });
    this.http.get('http://localhost:8087/v1/accounts/summary', options)
      .subscribe((response: Response) => {
        this.accountSummary = response.json();
    });
  }
}
