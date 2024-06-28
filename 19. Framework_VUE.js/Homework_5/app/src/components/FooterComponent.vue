<template>
        <footer class="footer center">
            <div class="footer__logo">
                <div class="footer__logo__company">
                    <svg width="33.997559" height="34.000244" viewBox="0 0 33.9976 34.0002" fill="none"
                        xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                        <desc>
                            Created with Pixso.
                        </desc>
                        <defs />
                        <path id="Logo"
                            d="M0 34L13.45 34L13.45 24.49C13.45 22.48 15.08 20.85 17.1 20.85C19.11 20.85 20.74 22.48 20.74 24.49L20.74 34L33.99 34L33.99 0C15.22 0 0 15.22 0 34Z"
                            fill="#CDA274" fill-opacity="1.000000" fill-rule="nonzero" />
                    </svg>
                    <p class="footer__logo__company__text">Interno</p>
                </div>
                <div class="footer__logo__social">
                    <svg width="17.964844" height="14.589844" viewBox="0 0 17.9648 14.5898" fill="none"
                        xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                        <desc>
                            Created with Pixso.
                        </desc>
                        <defs />
                        <path id=""
                            d="M17.96 1.72C17.47 2.46 16.83 3.09 16.13 3.62L16.13 4.11C16.13 9 12.44 14.58 5.66 14.58C3.55 14.58 1.61 13.99 0 12.93C0.28 12.97 0.56 13 0.87 13C2.6 13 4.18 12.41 5.44 11.42C3.83 11.39 2.46 10.33 2 8.85C2.25 8.89 2.46 8.92 2.7 8.92C3.02 8.92 3.37 8.85 3.65 8.78C1.96 8.43 0.7 6.96 0.7 5.16L0.7 5.13C1.19 5.41 1.79 5.55 2.39 5.58C1.37 4.92 0.73 3.79 0.73 2.53C0.73 1.82 0.91 1.19 1.23 0.66C3.05 2.88 5.8 4.35 8.85 4.53Q8.75 4.11 8.75 3.69C8.75 1.65 10.4 0 12.44 0C13.5 0 14.44 0.42 15.15 1.16C15.96 0.98 16.76 0.66 17.47 0.24C17.19 1.12 16.62 1.82 15.85 2.28C16.59 2.21 17.33 2 17.96 1.72Z"
                            fill="#292F36" fill-opacity="1.000000" fill-rule="evenodd" />
                    </svg>
                    <svg width="15.750000" height="15.714844" viewBox="0 0 15.75 15.7148" fill="none"
                        xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                        <desc>
                            Created with Pixso.
                        </desc>
                        <defs />
                        <path id=""
                            d="M3.76 1.86C3.76 2.91 2.91 3.79 1.86 3.79C0.84 3.79 0 2.91 0 1.86C0 0.84 0.84 0 1.86 0C2.91 0 3.76 0.84 3.76 1.86ZM15.75 15.71L12.48 15.71L12.48 10.61C12.48 9.38 12.44 7.83 10.75 7.83C9.07 7.83 8.82 9.14 8.82 10.51L8.82 15.71L5.55 15.71L5.55 5.2L8.68 5.2L8.68 6.64L8.71 6.64C9.17 5.83 10.23 4.95 11.81 4.95C15.11 4.95 15.75 7.13 15.75 9.94L15.75 15.71ZM3.51 5.2L3.51 15.71L0.24 15.71L0.24 5.2L3.51 5.2Z"
                            fill="#292F36" fill-opacity="1.000000" fill-rule="evenodd" />
                    </svg>
                </div>
            </div>
            <div class="footer__pages">
                <h2 class="footer__pages__title">Страницы</h2>
                <div class="footer__pages__links"> <a class="footer__pages__links__item" href="#">
                    Домой</a>
                    <a class="footer__pages__links__item" href="#">Проект</a>
                    <a class="footer__pages__links__item" href="#">Блог</a>
                </div>

            </div>
            <div class="footer__contacts">Контакты
                <p class="footer__contacts__text">55 East Birchwood Ave. Brooklyn, NewYork 11201</p>
                <p class="footer__contacts__text">contact@interno.com</p>
                <p class="footer__contacts__text">(123) 456 - 7890</p>
            </div>
        </footer>
</template>

<script>
    export default {
        
    }
</script>

<style lang="scss" scoped>

// глобальные свойства
* {
    margin: 0;
    padding: 0;
}

a {
    text-decoration: none;
}



.center {
    padding-left: calc(50% - 600px);
    padding-right: calc(50% - 600px);
}

// блоки

.header {
    margin-top: 54px;
    padding-bottom: 60px;
    height: 50px;
    display: flex;
    justify-content: space-between;
    align-items: center;

    &__logo {
        display: flex;
        justify-content: space-between;
        align-items: center;

        &__text {
            padding-left: 8px;
            color: rgb(41, 47, 54);
            font-family: DM Serif Display;
            font-size: 40px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 0%;
            text-align: left;
        }
    }

    &__menu {
        display: flex;
        gap: 50px;

        &__item {
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 20px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 0%;
            text-align: center;
        }
    }
}

.promo {
    position: relative;
    overflow: hidden;
    width: 1200px;
    height: 758px;
    background-image: url(@/assets/img/promo_banner.jpeg);
    background-position: 50% 42.5%;
    border-radius: 70px;
    display: flex;
    align-items: center;

    &__info {
        padding-left: 52px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        width: 595px;

        &__title {
            position: relative;
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 65px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 0%;
            text-align: left;
        }

        &__text {
            padding-top: 18px;
            color: rgb(77, 80, 83);
            font-family: Jost;
            font-size: 22px;
            font-weight: 400;
            line-height: 150%;
            letter-spacing: 1%;
            text-align: left;
            padding-bottom: 21px;
        }

        &__button {
            display: flex;
            gap: 10px;
            align-items: center;
            width: 140px;
            padding-top: 26px;
            padding-bottom: 26px;
            padding-left: 49px;
            color: rgb(255, 255, 255);
            font-family: Jost;
            font-size: 18px;
            font-weight: 600;
            line-height: 125%;
            letter-spacing: 2%;
            text-align: center;
            border-radius: 18px;
            background: rgb(41, 47, 54);

        }
    }

}

.notice {
    padding-top: 71px;
    padding-bottom: 91px;
    display: flex;
    gap: 8px;
    flex-direction: column;
    justify-content: center;

    &__title {
        color: rgb(41, 47, 54);
        font-family: Jost;
        font-size: 50px;
        font-weight: 400;
        line-height: 125%;
        letter-spacing: 2%;
        text-align: center;
    }

    &__text {
        padding-top: 18px;
        color: rgb(77, 80, 83);
        font-family: Jost;
        font-size: 22px;
        font-weight: 400;
        line-height: 150%;
        letter-spacing: 1%;
        text-align: center;
        padding-bottom: 21px;
    }

}

.products {
    display: grid;
    grid-template-columns: 1fr 1fr;
    column-gap: 100px;
    row-gap: 58px;

    &__item {
        width: 548px;
        height: 619px;

        &__img-1 {
            width: 548px;
            height: 525px;
            background-image: url(@/assets/img/products/top_products-1.jpeg);
            background-position: 80% 55%;
            border-radius: 0px 80px 0px 0px;
        }

        &__img-2 {
            width: 548px;
            height: 525px;
            background-image: url(@/assets/img/products/top_products-2.jpeg);
            background-position: 80% 55%;
            border-radius: 80px 0px 0px 0px;
        }

        &__img-3 {
            width: 548px;
            height: 525px;
            background-image: url(@/assets/img/products/top_products-3.jpeg);
            background-position: 80% 55%;
            border-radius: 0px 0px 80px 0px;
        }

        &__img-4 {
            width: 548px;
            height: 525px;
            background-image: url(@/assets/img/products/top_products-4.jpeg);
            background-position: 80% 55%;
            border-radius: 0px 0px 0px 80px;
        }

        &__content {
            padding-top: 43px;
            display: flex;
            justify-content: space-between;

            &__info {

                &__title {
                    color: rgb(41, 47, 54);
                    font-family: Jost;
                    font-size: 25px;
                    font-weight: 400;
                    line-height: 125%;
                    letter-spacing: 2%;
                    text-align: left;
                    margin-bottom: 4px;
                }

                &__text {
                    color: rgb(77, 80, 83);
                    font-family: Jost;
                    font-size: 22px;
                    font-weight: 400;
                    line-height: 150%;
                    letter-spacing: 1%;
                    text-align: left;
                }
            }

            &__button {
                width: 70px;
                height: 70px;
                display: flex;
                justify-content: center;
                align-items: center;
                border-radius: 70px;
                background: rgb(244, 240, 236);;
            }
        }

    }
}

.achivments {
    margin-top: 96px;
    height: 475px;
    background-color: rgb(244, 240, 236);;
    display: flex;
    justify-content: center;
    align-items: center;

    :last-child {
        border-right: 0;
    }

    &__item {
        width: 300px;
        height: 130px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        border-right: 1px solid rgb(205, 162, 116);

        &__count {
            color: rgb(205, 162, 116);
            font-family: Jost;
            font-size: 85px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 2%;
            text-align: left;
        }

        &__info {
            color: rgb(77, 80, 83);
            font-family: Jost;
            font-size: 22px;
            font-weight: 400;
            line-height: 150%;
            letter-spacing: 1%;
            text-align: left;
        }
    }
}

.articles {
    &__info {
        padding-top: 96px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        padding-bottom: 52px;

        &__title {
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 50px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 2%;
            text-align: center;
        }

        &__text {
            width: 500px;
            padding-top: 12px;
            color: rgb(77, 80, 83);
            font-family: Jost;
            font-size: 22px;
            font-weight: 400;
            line-height: 150%;
            letter-spacing: 1%;
            text-align: center;
        }

    }

    &__info-blog {
        display: flex;
        padding-bottom: 52px;

    }

    &__items {

        display: flex;
        flex-wrap: wrap;
        gap: 27px;

        &__item {
            display: flex;
            flex-direction: column;
            width: 338px;
            height: 477px;
            padding: 21px;
            border: 1px solid rgb(231, 231, 231);
            border-radius: 62px;
            box-shadow: 0px 10px 30px 0px rgba(255, 255, 255, 0.25);

            &__img-wrapper {
                height: 290px;
                position: relative;
                overflow: hidden;
                border-radius: 45px 45px 0 0;
            }

            &__img {
                position: absolute;
                top: -80px;
                left: -160px;

                &__label {
                    padding-left: 11px;
                    display: flex;
                    align-items: center;
                    position: absolute;
                    width: 124px;
                    height: 41px;
                    left: 20px;
                    top: 222px;
                    border-radius: 8px 8px 8px 0px;
                    background: rgb(255, 255, 255);
                    color: rgb(77, 80, 83);
                    font-family: Jost;
                    font-size: 16px;
                    font-weight: 400;
                    line-height: 150%;
                    letter-spacing: 1%;
                    text-align: left;
                    text-transform: capitalize;
                }
            }

            &__title {
                width: 305px;
                padding-top: 21px;
                color: rgb(41, 47, 54);
                font-family: Jost;
                font-size: 25px;
                font-weight: 400;
                line-height: 125%;
                letter-spacing: 2%;
                text-align: left;
            }

            &__date {
                padding-top: 40px;
                display: flex;
                justify-content: space-between;
                align-items: center;
                color: rgb(77, 80, 83);
                font-family: Jost;
                font-size: 16px;
                font-weight: 400;
                line-height: 150%;
                letter-spacing: 1%;
                text-align: left;
                text-transform: capitalize;

                &__button {
                    width: 70px;
                    height: 70px;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    border-radius: 70px;
                }
            }
        }


    }

    &__pagination {
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 20px;
        padding-top: 52px;
        padding-bottom: 170px;

        &__button {

            &__text {
                color: rgb(41, 47, 54);
                font-family: Jost;
                font-size: 16px;
                font-weight: 500;
                line-height: 150%;
                letter-spacing: 0%;
                text-align: left;
                text-transform: capitalize;
            }
        }
    }

    &__button {
        width: 200px;
        height: 52px;
        display: flex;
        justify-content: center;
        align-items: center;
        border-radius: 52px;
        background: rgb(244, 240, 236);;
        color: rgb(77, 80, 83);
        font-family: Jost;
        font-size: 22px;
        font-weight: 400;
        line-height: 150%;
        letter-spacing: 1%;
        text-align: center;
        text-transform: capitalize;
    }

}

.blog {
    display: flex;
    flex-direction: column;
    align-items: center;

    &__heading {
        height: 356px;
        width: 100%;
        display: flex;
        justify-content: center;
        background-position: 0% 50%;
        background-size: cover;
    }

    &__title {
        display: flex;
        flex-direction: column;
        align-items: center;
        width: 347px;
        height: 192px;
        border-radius: 37px 37px 0 0;
        background: rgb(255, 255, 255);
        margin-top: -175px;
        padding: 41px 78px 41px 78px;

        &__text-wrapper {
            display: flex;
            width: 100%;
        }

        &__text {
            display: flex;
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 50px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 0%;
            text-align: left;
        }
    }
}

.blog-details {
    padding-top: 200px;
    display: flex;
    padding-bottom: 63px;;

    &__tags {
        position: sticky;
        top: 0px;
        width: 100%;;
        height: calc(100% - 10px);
        padding-top: 24px;
        margin-left: 57px;
    }

    &__tags-wrapper {

        padding-top: 24px;
        width: 345px;
        display: flex;
        flex-wrap: wrap;
        align-content: flex-start;
        gap: 10px;
    }

    &__img {
        width: 100%;
    }

    &__post {
        width: 801px;
        padding-bottom: 63px;

        &__info {
            display: flex;
            justify-content: space-between;
            padding-top: 46px;
            padding-bottom: 48px;
            padding-right: 50px;
        }
    }
}


.last-post {
    margin-top: 100px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    margin-bottom: 88px;

    &__heading {
        width: 100%;
        padding-bottom: 22px;

        &__title {
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 50px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 2%;
            text-align: left;
        }
    }

    &__article {
        display: flex;
        align-items: center;
        padding: 22px;
        border: 1px solid rgb(231, 231, 231);
        border-radius: 62px;
        box-shadow: 0px 10px 30px 0px rgba(255, 255, 255, 0.25);

        &__img-wrapper {
            display: flex;
            flex: 0 0 auto;
            position: relative;
            overflow: hidden;
            width: 569px;
            height: 478px;
            border-radius: 50px;

        }

        &__img {
            position: absolute;
            top: -20px
        }

        &__content {
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            padding-left: 65px;
            padding-right: 54px;

            &__title {
                color: rgb(41, 47, 54);
                font-family: Jost;
                font-size: 25px;
                font-weight: 400;
                line-height: 125%;
                letter-spacing: 2%;
                text-align: left;
                padding-bottom: 22px;
            }

            &__text {
                color: rgb(77, 80, 83);
                font-family: Jost;
                font-size: 22px;
                font-weight: 400;
                line-height: 150%;
                letter-spacing: 1%;
                text-align: left;
            }

        }


    }
}

.footer {
    padding-top: 33px;
    padding-bottom: 40px;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;

    &__logo {

        &__company {
            display: flex;

            align-items: center;

            &__text {
                padding-left: 8px;
                color: rgb(41, 47, 54);
                font-family: DM Serif Display;
                font-size: 40px;
                font-weight: 400;
                line-height: 125%;
                letter-spacing: 0%;
                text-align: left;
            }
        }

        &__social {
            padding-top: 31px;
            display: flex;
            gap: 54px;
        }
    }

    &__pages {
        padding-left: 101px;
        display: flex;
        flex-direction: column;
        gap: 40px;


        &__title {
            display: flex;
            flex-direction: column;
            color: rgb(41, 47, 54);
            font-family: Jost;
            font-size: 25px;
            font-weight: 400;
            line-height: 125%;
            letter-spacing: 0%;
            text-align: left;
        }

        &__links {
            display: flex;
            flex-direction: column;
            gap: 40px;

            &__item {
                color: rgb(77, 80, 83);
                font-family: Jost;
                font-size: 22px;
                font-weight: 400;
                line-height: 300%;
                letter-spacing: 1%;
                text-align: left;
                line-height: normal;
            }
        }
    }

    &__contacts {
        padding-left: 101px;
        display: flex;
        flex-direction: column;
        gap: 40px;
        color: rgb(41, 47, 54);
        font-family: Jost;
        font-size: 25px;
        font-weight: 400;
        line-height: 125%;
        letter-spacing: 0%;
        text-align: left;

        &__text {
            color: rgb(77, 80, 83);
            font-family: Jost;
            font-size: 22px;
            font-weight: 400;
            line-height: 300%;
            letter-spacing: 1%;
            text-align: left;
            line-height: normal;
        }
    }
}

// элементы

.tag-button {
    border: none;
    border-radius: 10px;
    padding: 10px 30px;
    color: rgb(41, 47, 54);
    font-family: Jost;
    font-size: 18px;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 2%;
    text-align: center;
}

.tag-button:hover {
    color: white;
    background: rgb(41, 47, 54);
    cursor: pointer;
}

.breadcrumbs {
    color: rgb(77, 80, 83);
    font-family: Jost;
    font-size: 22px;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 1%;
    text-align: left;
}

.title {
    color: rgb(41, 47, 54);
    font-family: Jost;
    font-size: 50px;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 2%;
    text-align: left;
    padding-bottom: 21px;
}

.title-h3 {
    color: rgb(41, 47, 54);
    font-family: Jost;
    font-size: 25px;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 2%;
    text-align: left;
}

.text {
    color: rgb(77, 80, 83);
    font-family: Jost;
    font-size: 22px;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 1%;
    text-align: left;
}

.date {
    color: rgb(77, 80, 83);
    font-family: Jost;
    font-size: 16px;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 1%;
    text-align: left;
    text-transform: capitalize;
}

.pagination {
    color: rgb(77, 80, 83);
    font-family: Jost;
    font-size: 16px;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 1%;
    text-align: left;
    text-transform: capitalize;
}

.quote {
    margin-top: 35px;
    margin-bottom: 27px;
    height: 267px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    border-radius: 50px;
    background: rgb(244, 240, 236);
    color: rgb(205, 162, 116);
    font-family: DM Serif Display;
    font-style: italic;
    font-size: 25px;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 2%;
    text-align: center;

    &__tick {
        display: block;
        margin-top: -50px;
    margin-bottom: -120px;
        color: rgb(205, 162, 116);
        font-family: Jost;
        font-style: italic;
        font-size: 200px;
        font-weight: 400;
        line-height: 125%;
        letter-spacing: 2%;
        text-align: center;
    }
}

// модификаторы
.backgroundCreme {
    background: rgb(244, 240, 236);;
}

.backgroundWhite {
    background: white;
}

.borderButton {
    border: 1px solid rgb(205, 162, 116);
}

.border-img {
    border-radius: 50px;
}

.blogDetailsBanner {
    background-image: url(@/assets/img/blog_details_banner.jpeg);
}

.blogBanner {
    background-image: url(@/assets/img/blog_banner.jpeg);
}
</style>