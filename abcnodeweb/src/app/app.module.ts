import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { BankRoutingModule } from './bank-routing/bank-routing.module';

import { AppComponent } from './app.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountsComponent } from './accounts/accounts.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    DashboardComponent,
    AccountsComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    BankRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
