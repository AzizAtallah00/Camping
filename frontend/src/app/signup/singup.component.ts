import { Component } from '@angular/core';
import { User } from '../shared/classes/user';
import { MatDialog } from '@angular/material/dialog';
import { SigninComponent } from '../signin/signin.component';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.component.html',
  styleUrls: ['./singup.component.css']
})
export class SingupComponent {
  constructor(private matDialog: MatDialog) { }

  user = {} as User;
  openDialogSignIn() {
    this.matDialog.open(SigninComponent, { width: "60%", height: "70%" });
  }
}
