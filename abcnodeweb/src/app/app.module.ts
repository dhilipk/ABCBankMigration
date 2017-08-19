import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { BankRoutingModule } from './bank-routing/bank-routing.module';

import { AppComponent } from './app.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountsComponent } from './accounts/accounts.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    DashboardComponent,
    AccountsComponent
  ],
  imports: [
    BrowserModule,
    BankRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
