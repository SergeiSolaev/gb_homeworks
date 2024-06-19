import { createStore } from "vuex";

export default createStore({
    state: {
        projects: [
            {
                id: 1,
                tag: 'Ванная комната',
                title: 'Минималистичная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_1/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),
            },
            {
                id: 2,
                tag: 'Ванная комната',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_2/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_2/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_2/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_2/img_details_3.jpeg"),
            },
            {
                id: 3,
                tag: 'Спальня',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_3/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),
            },
            {
                id: 4,
                tag: 'Спальня',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_4/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),

            },
            {
                id: 5,
                tag: 'Кухня',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_5/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),

            },
            {
                id: 6,
                tag: 'Кухня',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_6/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),
            },
            {
                id: 7,
                tag: 'Гостинная',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_7/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),
            },
            {
                id: 8,
                tag: 'Гостинная',
                title: 'Современная спальня',
                breadcrumbs: 'Декор / Планировка',
                favorite: false,
                description: 'Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur Lorem ipsum dolor sit amet, consectetur',
                img_item: require("@/assets/img/our_project/project_8/img_1.jpeg"),
                img_details_1: require("@/assets/img/our_project/project_1/img_details_1.jpeg"),
                img_details_2: require("@/assets/img/our_project/project_1/img_details_2.jpeg"),
                img_details_3: require("@/assets/img/our_project/project_1/img_details_3.jpeg"),

            },
        ],
    },

    getters: {
        getProjects (state)  {
            return state.projects;
        }
    },
    mutations: {

    },
    actions: {
        
    },
    modules: {
        
    }
})