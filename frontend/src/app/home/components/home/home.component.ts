import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  slides: any[] = [];
  responsiveOptions: any[] = [];

  ngOnInit() {
    // Dummy product data
    this.slides = [
      { name: 'Djbal Rsas', price: 50, image: '/assets/background.svg', inventoryStatus: 'INSTOCK' },
      { name: 'Ain Drahem', price: 100, image: '/assets/campingPic.jpg', inventoryStatus: 'OUTOFSTOCK' },
      { name: 'Bouhertma Jendouba', price: 75, image: '/assets/campingPic5.jpg', inventoryStatus: 'LOWSTOCK' },
      { name: 'Testour', price: 120, image: '/assets/campingPic3.jpg', inventoryStatus: 'INSTOCK' },
      { name: 'Ras Angela', price: 90, image: '/assets/campingPic4.jpg', inventoryStatus: 'LOWSTOCK' }
    ];

    // Carousel responsive options
    this.responsiveOptions = [
      {
        breakpoint: '1024px',
        numScroll: 1
      },
      {
        breakpoint: '768px',
        numScroll: 1
      },
      {
        breakpoint: '560px',
        numScroll: 1
      }
    ];
  }

  getSeverity(status: string): string {
    switch (status) {
      case 'INSTOCK':
        return 'success';
      case 'LOWSTOCK':
        return 'warning';
      case 'OUTOFSTOCK':
        return 'danger';
      default:
        return 'info';
    }
  }
}
