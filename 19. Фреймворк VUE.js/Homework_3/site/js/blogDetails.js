const blogdetails = {
    data() {
        return {
            postsMain: [
                {
                    id: 1,
                    title: 'Создадим лучший макет перепланировки',
                    name: 'Кухня',
                    img_heading: 'img/blogDetails/post_1/img-heading.jpeg',
                    img_post: 'img/blogDetails/post_1/img-2.jpeg',
                    date:  '20 Декабрь,2022',
                    text_start: 'В своей статье от 1994-го года журнал «Before & After» отследил фразу «Lorem ipsum ...» до философского трактата Цицерона О пределах добра и зла, написанного в 45 году до нашей эры на латинском языке. В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                    quote: 'Какая-то умная и красивая цитата',
                    subtitle: 'Design sprints are great',
                    text_end: 'В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                },
                {
                    id: 2,
                    title: 'Лучшая спальня для Вас',
                    name: 'Спальня',
                    img_heading: 'img/blogDetails/post_2/img-heading.jpeg',
                    img_post: 'img/blogDetails/post_2/img-2.jpeg',
                    date:  '20 Декабрь,2022',
                    text_start: 'В своей статье от 1994-го года журнал «Before & After» отследил фразу «Lorem ipsum ...» до философского трактата Цицерона О пределах добра и зла, написанного в 45 году до нашей эры на латинском языке. В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                    quote: 'Какая-то умная и красивая цитата',
                    subtitle: 'Design sprints are great',
                    text_end: 'В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                },
                {
                    id: 3,
                    title: 'Современная архитектура',
                    name: 'Архитектура',
                    img_heading: 'img/blogDetails/post_3/img-heading.jpeg',
                    img_post: 'img/blogDetails/post_3/img-2.jpeg',
                    date:  '20 Декабрь,2022',
                    text_start: 'В своей статье от 1994-го года журнал «Before & After» отследил фразу «Lorem ipsum ...» до философского трактата Цицерона О пределах добра и зла, написанного в 45 году до нашей эры на латинском языке. В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                    quote: 'Какая-то умная и красивая цитата',
                    subtitle: 'Design sprints are great',
                    text: 'В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что',
                    text_end: 'В оригинале текст выглядит так «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ...», и переводится как «Нет никого, кто любил бы свою боль, кто искал бы ее и хотел бы чтобы она была у него. Потому что это боль...»',
                },
            ],
            posts: [],
        }
    },
    mounted() {
        this.posts = this.postsMain;
      },
    methods: {
        sortByTag(name) {            
            if (name == 'Все') {
                this.posts = this.postsMain 
            } else {
            this.posts = this.posts.filter(post => post.name == name)
            }
        },
    },

    template: `
        <div class="blog-details__post-wrapper">
            <div class="blog-details__post" id="blog-details__post" v-for="post in posts" :key="post.id" :name="post.name">
                <h1 class="title">{{ post.title }}</h1>
                <img class="blog-details__img border-img" :src="post.img_heading">
                <div class="blog-details__post__info">
                    <div class="date">26 Декабрь,2022 </div>
                    <div class="pagination">Интерьер / Домой / Декор</div>
                </div>
                <p class="text">{{post.text_start}}</p>
                    <div class="quote">
                        <p class="quote__tick">"</p>
                        {{post.quote}}
                    </div>
                    <h1 class="title">{{post.subtitle}}</h1>
                    <p class="text">{{post.text}}</p>
                    <br>
                    <img class="blog-details__img border-img" :src="post.img_post" alt="">
                    <br>
                    <p class="text">{{post.text_end}}</p>
                    <br>
                    <hr>
            </div>
        </div>
            <div class="blog-details__tags">
                <h3 class="title-h3">Тэги</h3>
                <div class="blog-details__tags-wrapper">
                    <button href="#" class="tag-button backgroundCreme" v-for="post in posts" :key="post.id" @click="sortByTag(post.name)">
                        {{ post.name }}
                    </button>
                    <a href="#blog-details__post" class="tag-button backgroundCreme" @click="sortByTag('Все')">Все</a>
                </div>
            </div>
        `
}