import Vue from 'vue'
import VueRouter from 'vue-router'
import ProductList from "../views/ProductList";
import Details from "../views/Details"
import Cart from "../views/Cart"
import Index from "../views/Index"
import Login from "../views/Login"
import Register from "../views/Register"


Vue.use(VueRouter)


const routes = [
  {
    path:'/',
    name:'Index',
    component: Index
  },
    {
        path:'/Login',
        name:'Login',
        component: Login
    },
    {
        path:'/Register',
        name:'Register',
        component: Register
    },
  {
    path:'/ProductList',
    name:'ProductList',
    component: ProductList
  },
    {
      path:'/Details',
      name:'Details',
      component:Details
    },
    {
        path:'/Cart',
        name:'Cart',
        component:Cart
    }
]

const router = new VueRouter({
  routes
})

export default router
