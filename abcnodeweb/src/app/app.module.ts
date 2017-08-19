import { BrowserModule } from '@angular/platform-browser';
import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';

import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { BankRoutingModule } from './bank-routing/bank-routing.module';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountsComponent } from './accounts/accounts.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { BaseRequestOptions, HttpModule, Http, XHRBackend, RequestOptions } from '@angular/http';

import { AuthenticationService } from './authentication/authentication.service';
import { AuthenticateGuard } from './guard/authenticate.guard';
import { AccountsHeaderComponent } from './accounts-header/accounts-header.component';
import { AccountStatementComponent } from './accounts/account-statement/account-statement.component';
import { CobComponent } from './cob/cob.component';
import { BankingComponent } from './banking/banking.component';
import { BenificiaryComponent } from './banking/benificiary/benificiary.component';
import { FundTransferComponent } from './banking/fund-transfer/fund-transfer.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    DashboardComponent,
    AccountsComponent,
    HeaderComponent,
    FooterComponent,
    AccountsHeaderComponent,
    AccountStatementComponent,
    CobComponent,
    BankingComponent,
    BenificiaryComponent,
    FundTransferComponent
  ],
  imports: [
    BrowserModule,
    MDBBootstrapModule.forRoot(),
    HttpModule,
    FormsModule,
    BankRoutingModule
  ],
  providers: [
    AuthenticateGuard,
    AuthenticationService,
    BaseRequestOptions
  ],
  bootstrap: [AppComponent],
  schemas: [ NO_ERRORS_SCHEMA ]
})
export class AppModule { }
