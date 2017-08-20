import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Router } from '@angular/router';

import { RestServiceService } from '../services/rest-service.service';

@Component({
  selector: 'app-cob',
  templateUrl: './cob.component.html',
  styleUrls: ['./cob.component.scss']
})
export class CobComponent implements OnInit {
  model: any = {};
  loading: Boolean = false;
  showResponse: Boolean = false;
  response: any = {};

  constructor(private http:Http, private service:RestServiceService, private router: Router) { }

  ngOnInit() {
  }

  public saveOnBoardingDetails() {
    this.loading = true;
    this.service.saveOnBoardingDetails(this.model)
    .subscribe(result => {
      this.response = result;
      this.showResponse = true;
      this.model = {};
    });
  }
}
