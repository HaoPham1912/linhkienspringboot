import { INavData } from '@coreui/angular';

export const navItems: INavData[] = [
  {
    name: 'Manage',
    url: '/admin/manage',
    icon: 'icon-settings',
    children: [    
      {
        name: 'Users',
        url: '/admin/manage/users',
        icon: 'icon-people'
      },
      {
        name: 'Categories',
        url: '/admin/manage/categories',
        icon: 'icon-list'
      },
      {
        name: 'Product',
        url: '/admin/manage/products',
        icon: 'icon-basket-loaded'
      },
      {
        name: 'Order',
        url: '/admin/manage/orders',
        icon: 'icon-docs'
      },
     
    ]
  },
 
  
 
  //     {
  //       name: 'Register',
  //       url: '/register',
  //       icon: 'icon-star'
  //     },
  //     {
  //       name: 'Error 404',
  //       url: '/404',
  //       icon: 'icon-star'
  //     },
  //     {
  //       name: 'Error 500',
  //       url: '/500',
  //       icon: 'icon-star'
  //     }
  //   ]
  // },
 
  
];
export const navUserItems: INavData[] = [
 
    {
      name: 'HomePage',
      url: '/user/homepage',
      icon: 'icon-people'
    },
    {
      name: 'Change Information',
      url: '/user/manage/information',
      icon: 'icon-list'
    },
    {
      name: 'Check Orders',
      url: '/user/manage/checkorders',
      icon: 'icon-basket-loaded'
    },
    {
      name: 'Log Out',
      url: '/guest/homepage',
      icon: 'icon-docs'
    }, 
  ];
