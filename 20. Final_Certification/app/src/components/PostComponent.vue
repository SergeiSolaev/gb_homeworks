<template>
        <div class="blog-details__post-wrapper">
            <div class="blog-details__post" id="blog-details__post" v-for="post in posts" :key="post.id" :name="post.title">
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
                    <a href="#blog-details__post" class="tag-button backgroundBright" @click="sortByTag('Все')">Все</a>
                    <button href="#" class="tag-button backgroundBright"v-for="(tag, index) in tags" :key="index" @click="sortByTag(tag)">
                        {{ tag }}
                    </button>
                </div>
        </div>
</template>

<script>
    import { mapState } from 'vuex';
    export default {
        
        data() {
            return {
                posts: [],
                tags: [],
            }
        },
        computed: {
           ...mapState(['postsStore']),
        },
        mounted() {
            this.posts = this.postsStore;
            this.createTags();
        },
        methods: {
            createTags() {
                this.tags = [];
                this.postsStore.forEach(post => {
                    if (!this.tags.includes(post.tag)) {
                        this.tags.push(post.tag);
                    }
                });
            },
            sortByTag(tag) {            
                if (tag == 'Все') {
                    this.createTags();
                    this.posts = this.postsStore
                } else {
                    this.posts = this.postsStore;
                    this.posts = this.posts.filter(post => post.tag == tag)
                    this.tags = [];
                    this.tags.push(tag);
                }
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>