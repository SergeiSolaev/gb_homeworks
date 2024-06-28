// импортируем компоненты роутера
import {createRouter, createWebHistory} from 'vue-router';

// импортируем маршруты (страницы на которые будем переходить)
import BlogDetailsPage from '@/pages/BlogDetailsPage.vue';
import BlogPage from '@/pages/BlogPage.vue';
import MainPage from '@/pages/MainPage.vue';
import OurProjectPage from '@/pages/OurProjectPage.vue';
import ProjectDetailsPage from '@/pages/ProjectDetailsPage.vue';

// создаем маршруты
const routes = [
    {
        path: '/',
        name: 'MainPage',
        component: MainPage
    },
    {
        path: '/blog',
        name: 'BlogPage',
        component: BlogPage
    },
    {
        path: '/blog/:id',
        name: 'BlogDetailsPage',
        component: BlogDetailsPage
    },
    {
        path: '/our-project',
        name: 'OurProjectPage',
        component: OurProjectPage
    },
    {
        path: '/our-project/:id',
        name: 'ProjectDetailsPage',
        component: ProjectDetailsPage
    },
    {
        path: '/:pathMatch(.*)*',
        name: 'NotFoundPage',
        component: () => import('@/pages/NotFoundPage.vue')
    }
];

// создаем роутер

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
    scrollBehavior(to, from, savePosition) {
        return {
            top: 0,
        }
    }
})

export default router;