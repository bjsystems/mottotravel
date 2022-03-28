import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8088'

const appInstance = createApp(App)
appInstance.config.globalProperties.axios = axios;
appInstance.mount('#app')
/*const app = createApp(App)
app.config.globalProperties.axios = axios;
app.use(store).use(router).mount('#app')*/


