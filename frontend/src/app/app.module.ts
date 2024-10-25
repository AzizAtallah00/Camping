import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { ExploreComponent } from './explore/explore.component';
import { CartComponent } from './explore/cart/cart.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { SigninComponent } from './signin/signin.component';
import { SingupComponent } from './singup/singup.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogModule } from '@angular/material/dialog';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ExploreComponent,
    CartComponent,
    AboutUsComponent,
    SigninComponent,
    SingupComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatDialogModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
